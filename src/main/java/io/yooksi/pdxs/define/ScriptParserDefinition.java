package io.yooksi.pdxs.define;

import com.intellij.lang.*;
import com.intellij.lexer.Lexer;
import com.intellij.openapi.project.Project;
import com.intellij.psi.*;
import com.intellij.psi.tree.*;

import io.yooksi.pdxs.ScriptLanguage;
import io.yooksi.pdxs.lexer.ScriptLexerAdapter;
import io.yooksi.pdxs.parser.ScriptParser;
import io.yooksi.pdxs.psi.ScriptFile;
import io.yooksi.pdxs.psi.ScriptTypes;
import org.jetbrains.annotations.NotNull;

public class ScriptParserDefinition implements ParserDefinition {
	public static final TokenSet WHITE_SPACES = TokenSet.create(TokenType.WHITE_SPACE);
	public static final TokenSet COMMENTS = TokenSet.create(ScriptTypes.COMMENT);

	public static final IFileElementType FILE = new IFileElementType(ScriptLanguage.INSTANCE);

	@NotNull
	@Override
	public Lexer createLexer(Project project) {
		return new ScriptLexerAdapter();
	}

	@NotNull
	public TokenSet getWhitespaceTokens() {
		return WHITE_SPACES;
	}

	@NotNull
	@Override
	public TokenSet getCommentTokens() {
		return COMMENTS;
	}

	@NotNull
	@Override
	public TokenSet getStringLiteralElements() {
		return TokenSet.EMPTY;
	}

	@NotNull
	@Override
	public PsiParser createParser(final Project project) {
		return new ScriptParser();
	}

	@Override
	public IFileElementType getFileNodeType() {
		return FILE;
	}

	@Override
	public PsiFile createFile(FileViewProvider viewProvider) {
		return new ScriptFile(viewProvider);
	}

	@Override
	public SpaceRequirements spaceExistenceTypeBetweenTokens(ASTNode left, ASTNode right) {
		return SpaceRequirements.MAY;
	}

	@NotNull
	@Override
	public PsiElement createElement(ASTNode node) {
		return ScriptTypes.Factory.createElement(node);
	}
}