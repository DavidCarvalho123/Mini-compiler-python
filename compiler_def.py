if "." in __name__:
    from .PythonParser import PythonParser
    from .PythonParserVisitor import PythonParserVisitor
else:
    from PythonParser import PythonParser
    from PythonParserVisitor import PythonParserVisitor

class Compiler(PythonParserVisitor):

    def __init__(self):
        super(Compiler, self).__init__()
        self.vars = {}
        self.funcVars = {}
        return None
    
    # Paste here all methods in PythonParserVisitor.py file
    
    # Visit a parse tree produced by PythonParser#code.
    def visitCode(self, ctx:PythonParser.CodeContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        results = []
        for func in ctx.func():
            result = self.visit(func)
            if result is not None:
                results.append(result)
        for func_call in ctx.func_call():
            result = self.visit(func_call)
            if result is not None:
                results.append(result)
        for stat in ctx.stat():
            result = self.visit(stat)
            if result is not None:
                results.append(result)
       
        return results


    # Visit a parse tree produced by PythonParser#stat.
    def visitStat(self, ctx:PythonParser.StatContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        if ctx.expr():
            return self.visit(ctx.expr())
        elif ctx.query():
            return self.visit(ctx.query())
        elif(ctx.assignment()):
            return self.visit(ctx.assignment())
        return None


    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        term = self.visit(ctx.term())
        if(ctx.PLUS()):
            return self.evaluate_expr((ctx.PLUS().getText(), self.visit(ctx.expr()), term))
        elif(ctx.MINUS()):
            return self.evaluate_expr((ctx.MINUS().getText(), self.visit(ctx.expr()), term))
        return term

    # Visit a parse tree produced by PythonParser#term.
    def visitTerm(self, ctx:PythonParser.TermContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        factor = self.visit(ctx.factor())
        if(ctx.MULT()):
            return self.evaluate_expr((ctx.MULT().getText(), self.visit(ctx.term()), factor))
        elif(ctx.DIV()):
            return self.evaluate_expr((ctx.DIV().getText(), self.visit(ctx.term()), factor))
        elif(ctx.MOD()):
            return self.evaluate_expr((ctx.MOD().getText(), self.visit(ctx.term()), factor))
        elif(ctx.FLOOR_DIV()):
            return self.evaluate_expr((ctx.FLOOR_DIV().getText(), self.visit(ctx.term()), factor))
        return factor


    # Visit a parse tree produced by PythonParser#factor.
    def visitFactor(self, ctx:PythonParser.FactorContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        base = self.visit(ctx.base())
        if ctx.EXP():
            return (ctx.EXP().getText(), base,self.visit(ctx.factor()))
        return base


    # Visit a parse tree produced by PythonParser#base.
    def visitBase(self, ctx:PythonParser.BaseContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))

        if ctx.ids():
            print("Found ID:" + ctx.ids().getText())
            return ('ID', ctx.ids().getText())
        elif ctx.numeros():
            textNumber = ctx.numeros().getText()
            if '.' in textNumber or 'e' in textNumber.lower():
                print("Found FLOAT:" + textNumber)
                return ('FLOAT',float(textNumber))
            print("Found INT:" + textNumber)
            return ('INT', int(textNumber))
        elif ctx.expr():
            return self.visit(ctx.expr())
        elif ctx.func_call():
            return self.visit(ctx.func_call())
        return None

    
    
    # Visit a parse tree produced by PythonParser#assignment.
    def visitAssignment(self, ctx:PythonParser.AssignmentContext):
        # Returns FLOAT if value (typically the result of a operation) is decimal, otherwise INT
        def validateFloatReturnType(value):
            return 'FLOAT' if isinstance(value,float) else 'INT'
        
        varName = ctx.ID().getText()
        expr_tree = self.visit(ctx.expr())
        val = self.evaluate_expr(expr_tree) # calculates real value of expr
        value = (validateFloatReturnType(val), val)

        if ctx.ASSIGN():
            self.vars[varName] = value
        else:
            if not (isinstance(self.vars.get(varName, 0)[1],(int, float)) and isinstance(value[1], (int, float))):
                raise TypeError(f"Incompatible types while trying arithmetic assignment {ctx.getText()}")
            # only operating on numbers
            numValMem = self.vars.get(varName, 0)[1]
            numVal = value[1]
            dataType = self.vars.get(varName, 0)[1]
            if ctx.ADD_ASSIGN():
                result = numValMem + numVal
                self.vars[varName] = (validateFloatReturnType(result), result)
            elif ctx.SUB_ASSIGN():
                result = numValMem - numVal
                self.vars[varName] = (validateFloatReturnType(result), result)
            elif ctx.MUL_ASSIGN():
                result = numValMem * numVal
                self.vars[varName] = (validateFloatReturnType(result), result)
            elif ctx.DIV_ASSIGN():
                if numVal == 0:
                    raise ZeroDivisionError(f"Division by zero in {ctx.getText()}")
                self.vars[varName] = ('FLOAT', numValMem / numVal)
            elif ctx.MOD_ASSIGN():
                result = numValMem % numVal
                self.vars[varName] = (validateFloatReturnType(result), result)
            elif ctx.FLOOR_DIV_ASSIGN():
                if numVal == 0:
                    raise ZeroDivisionError(f"Division by zero in {ctx.getText()}")
                self.vars[varName] = ('FLOAT' if isinstance(numValMem,float) or isinstance(numVal, float) else 'INT', numValMem // numVal)
            elif ctx.EXP_ASSIGN():
                result = numValMem ** numVal
                self.vars[varName] = (validateFloatReturnType(result), result)

        print(f"{varName} updated to {self.vars[varName]}")
        return self.vars[varName]

    # Visit a parse tree produced by PythonParser#ids.
    def visitIds(self, ctx:PythonParser.IdsContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#numeros.
    def visitNumeros(self, ctx:PythonParser.NumerosContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#query.
    def visitQuery(self, ctx:PythonParser.QueryContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))

        if ctx.booleans():
            return self.visit(ctx.booleans())
        elif ctx.NOT():
            return (ctx.NOT().getText(), self.visit(ctx.query(0)))
        elif ctx.AND() or ctx.OR():
            return (ctx.AND().getText() if ctx.AND() else ctx.OR.getText(), self.visit(ctx.query(0)), self.visit(ctx.query(1)))
        elif ctx.expr():  # expr == expr, etc.
            left = self.visit(ctx.expr(0))
            right = self.visit(ctx.expr(1))
            if ctx.EQ():
                return (ctx.EQ().getText(), left, right)
            elif ctx.NEQ():
                return (ctx.NEQ().getText(), left, right)
            elif ctx.LT():
                return (ctx.LT().getText(), left, right)
            elif ctx.LTE():
                return (ctx.LTE().getText(), left, right)
            elif ctx.GT():
                return (ctx.GT().getText(), left, right)
            elif ctx.GTE():
                return (ctx.GTE().getText(), left, right)
        elif ctx.query(0):
            return self.visit(ctx.query(0))
        elif ctx.func_call():
            return self.visit(ctx.func_call())
        return None


    # Visit a parse tree produced by PythonParser#booleans.
    def visitBooleans(self, ctx:PythonParser.BooleansContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        # assing booleans?
        if(ctx.TRUE()):
            return ('BOOL', True)
        elif(ctx.FALSE()):
            return ('BOOL', False)
        return None


    # Visit a parse tree produced by PythonParser#condicional.
    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        func_name = ctx.ID().getText()
        
        params = self.visit(ctx.param_list()) if ctx.param_list() else []

        body = list(ctx.stat())
        
        return_stmt = ctx.return_stmt() if ctx.return_stmt() else None

        func_struct = (ctx.DEF().getText(), func_name, params, body, return_stmt)
        self.vars[func_name] = func_struct
        print(f"Function {func_name} defined with params {params}")
        
        return func_struct


    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        func_name = ctx.ID().getText()

        func = self.vars.get(func_name)
        if not func or func[0] != 'def':
            raise NameError(f"Function {func_name} not defined")
        
        _def, _name, param_list, body, return_stmt = func

        args = self.visit(ctx.args_list()) if ctx.args_list() else []
        local_scope = {}
        for i, param in enumerate(param_list):
            paramName, _, defaultVal = param
            if i < len(args):
                local_scope[paramName] = args[i]
            elif defaultVal is not None:
                local_scope[paramName] = defaultVal
            else:
                raise ValueError(f"Missing argument for parameter {paramName}")

        self.funcVars = dict(local_scope)
        result = None
        for stat in body:
            result = self.evaluate_stat(stat)
        
        if return_stmt:
            result = self.visit(return_stmt.expr()) if return_stmt.expr() else None

        self.funcVars = {}
        return result


    def evaluate_stat(self,stat):
        if isinstance(stat, tuple):
            return self.evaluate_expr(stat)
        elif hasattr(stat, 'assignment'):
            return self.visitAssignment(stat.assignment())
        elif hasattr(stat, 'expr'):
            # Could be expr or stat containing expr
            if stat.expr():
                expr_tree = self.visit(stat.expr())
                return self.evaluate_expr(expr_tree)
        elif hasattr(stat, 'query'):
            query_tree = self.visit(stat.query())
            return self.evaluate_expr(query_tree)


    def evaluate_expr(self, expr):
        if isinstance(expr, tuple):
            op = expr[0]
            if op in ('+', '-', '*', '/', '%', '**', '//'):
                left = self.evaluate_expr(expr[1])
                right = self.evaluate_expr(expr[2])
                if op == '+': return left + right
                elif op == '-': return left - right
                elif op == '*': return left * right
                elif op == '/': return left / right
                elif op == '%': return left % right
                elif op == '**': return left ** right
                elif op == '//': return left // right
            elif op in ('==', '!=', '<', '<=', '>', '>='):
                left = self.evaluate_expr(expr[1])
                right = self.evaluate_expr(expr[2])
                return eval(f"{left} {op} {right}")
            elif op == 'ID':
                return self.funcVars.get(expr[1], self.vars.get(expr[1], (None, None)))[1]
            elif op in ('INT', 'FLOAT', 'BOOL'): # Literal vals, como ('INT', 1)
                return expr[1]
        elif isinstance(expr, (int, float, bool)):
            return expr
        return expr

    # Visit a parse tree produced by PythonParser#args_list.
    def visitArgs_list(self, ctx:PythonParser.Args_listContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return [self.visit(arg) for arg in ctx.expr()]


    # Visit a parse tree produced by PythonParser#param_list.
    def visitParam_list(self, ctx:PythonParser.Param_listContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return [self.visit(param) for param in ctx.param()]


    # Visit a parse tree produced by PythonParser#param.
    def visitParam(self, ctx:PythonParser.ParamContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        name = ctx.ID().getText()
        typeParam = ctx.TYPE().getText() if ctx.TYPE() else None
        defaultVal = self.evaluate_expr(self.visit(ctx.expr())) if ctx.expr() else None
        print((name,typeParam,defaultVal))
        return (name,typeParam,defaultVal)

    # Visit a parse tree produced by PythonParser#return_stmt.
    def visitReturn_stmt(self, ctx:PythonParser.Return_stmtContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        if ctx.expr():
            return (ctx.RETURN().getText() ,self.visit(ctx.expr()))
        return (ctx.RETURN().getText(), None)


    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_for.
    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)

del (PythonParser, PythonParserVisitor)
