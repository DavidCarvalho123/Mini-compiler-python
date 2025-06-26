# Generated from PythonParser.g4 by ANTLR 4.13.2
from antlr4 import *
if "." in __name__:
    from .PythonParser import PythonParser
else:
    from PythonParser import PythonParser

# This class defines a complete generic visitor for a parse tree produced by PythonParser.

class PythonParserVisitor(ParseTreeVisitor):

    # Visit a parse tree produced by PythonParser#code.
    def visitCode(self, ctx:PythonParser.CodeContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#stat.
    def visitStat(self, ctx:PythonParser.StatContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#expr.
    def visitExpr(self, ctx:PythonParser.ExprContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#term.
    def visitTerm(self, ctx:PythonParser.TermContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#factor.
    def visitFactor(self, ctx:PythonParser.FactorContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#base.
    def visitBase(self, ctx:PythonParser.BaseContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#ids.
    def visitIds(self, ctx:PythonParser.IdsContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#numeros.
    def visitNumeros(self, ctx:PythonParser.NumerosContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#query.
    def visitQuery(self, ctx:PythonParser.QueryContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#booleans.
    def visitBooleans(self, ctx:PythonParser.BooleansContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#assignment.
    def visitAssignment(self, ctx:PythonParser.AssignmentContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#condicional.
    def visitCondicional(self, ctx:PythonParser.CondicionalContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func.
    def visitFunc(self, ctx:PythonParser.FuncContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#func_call.
    def visitFunc_call(self, ctx:PythonParser.Func_callContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#args_list.
    def visitArgs_list(self, ctx:PythonParser.Args_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param_list.
    def visitParam_list(self, ctx:PythonParser.Param_listContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#param.
    def visitParam(self, ctx:PythonParser.ParamContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#return_stmt.
    def visitReturn_stmt(self, ctx:PythonParser.Return_stmtContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_while.
    def visitLoop_while(self, ctx:PythonParser.Loop_whileContext):
        return self.visitChildren(ctx)


    # Visit a parse tree produced by PythonParser#loop_for.
    def visitLoop_for(self, ctx:PythonParser.Loop_forContext):
        return self.visitChildren(ctx)



del PythonParser