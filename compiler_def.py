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
        return None
    
    # Paste here all methods in PythonParserVisitor.py file
    
    # Visit a parse tree produced by PythonParser#code.
    def visitCode(self, ctx:PythonParser.CodeContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        results = []
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
        return None


    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        term = self.visit(ctx.term())
        if(ctx.PLUS()):
            return (ctx.PLUS().getText(), self.visit(ctx.expr()), term)
        elif(ctx.MINUS()):
            return (ctx.MINUS().getText(), self.visit(ctx.expr()), term)
        return term

    # Visit a parse tree produced by PythonParser#term.
    def visitTerm(self, ctx:PythonParser.TermContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        factor = self.visit(ctx.factor())
        if(ctx.MULT()):
            return (ctx.MULT().getText(), self.visit(ctx.term()), factor)
        elif(ctx.DIV()):
            return (ctx.DIV().getText(), self.visit(ctx.term()), factor)
        elif(ctx.MOD()):
            return (ctx.MOD().getText(), self.visit(ctx.term()), factor)
        elif(ctx.FLOOR_DIV()):
            return (ctx.FLOOR_DIV().getText(), self.visit(ctx.term()), factor)
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
        return None

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
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#booleans.
    def visitBooleans(self, ctx:PythonParser.BooleansContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#condicional.
    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#args_list.
    def visitArgs_list(self, ctx:PythonParser.Args_listContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param_list.
    def visitParam_list(self, ctx:PythonParser.Param_listContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param.
    def visitParam(self, ctx:PythonParser.ParamContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_for.
    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        print('Bem-vindo ' + ctx.getText() + ' ' + str(type(ctx)))
        return self.visitChildren(ctx)

del (PythonParser, PythonParserVisitor)
