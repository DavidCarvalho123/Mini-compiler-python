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
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#stat.
    def visitStat(self, ctx:PythonParser.StatContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonParser#term.
    def visitTerm(self, ctx:PythonParser.TermContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#factor.
    def visitFactor(self, ctx:PythonParser.FactorContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#base.
    def visitBase(self, ctx:PythonParser.BaseContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)

    # Visit a parse tree produced by PythonParser#ids.
    def visitIds(self, ctx:PythonParser.IdsContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#numeros.
    def visitNumeros(self, ctx:PythonParser.NumerosContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#query.
    def visitQuery(self, ctx:PythonParser.QueryContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#booleans.
    def visitBooleans(self, ctx:PythonParser.BooleansContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#condicional.
    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#args_list.
    def visitArgs_list(self, ctx:PythonParser.Args_listContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param_list.
    def visitParam_list(self, ctx:PythonParser.Param_listContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param.
    def visitParam(self, ctx:PythonParser.ParamContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_for.
    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        print(('Here', ctx.getText(), type(ctx)))
        return self.visitChildren(ctx)

del (PythonParser, PythonParserVisitor)
