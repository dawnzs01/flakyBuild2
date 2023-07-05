// Generated from io/edurt/datacap/sql/parser/SqlBase.g4 by ANTLR 4.12.0
package io.edurt.datacap.sql.parser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SqlBaseParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#kafkaQueryTopicStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaQueryTopicStatement(SqlBaseParser.KafkaQueryTopicStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#kafkaQueryConsumerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaQueryConsumerStatement(SqlBaseParser.KafkaQueryConsumerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#kafkaQueryStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaQueryStatement(SqlBaseParser.KafkaQueryStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#kafkaStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKafkaStatement(SqlBaseParser.KafkaStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#childPathStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChildPathStatement(SqlBaseParser.ChildPathStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#columnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnStatement(SqlBaseParser.ColumnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SqlBaseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SqlBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SqlBaseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SqlBaseParser.QuotedIdentifierContext ctx);
}