package io.yooksi.pdxs.syntax;

import com.intellij.lexer.Lexer;
import com.intellij.openapi.editor.*;
import com.intellij.openapi.editor.colors.TextAttributesKey;
import com.intellij.openapi.fileTypes.SyntaxHighlighterBase;
import com.intellij.psi.TokenType;
import com.intellij.psi.tree.IElementType;
import io.yooksi.pdxs.lexer.ScriptLexerAdapter;
import io.yooksi.pdxs.psi.ScriptTypes;
import org.jetbrains.annotations.NotNull;

import static com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey;

public class ScriptSyntaxHighlighter extends SyntaxHighlighterBase {
	public static final TextAttributesKey SEPARATOR =
			createTextAttributesKey("SIMPLE_SEPARATOR", DefaultLanguageHighlighterColors.OPERATION_SIGN);
	public static final TextAttributesKey KEY =
			createTextAttributesKey("SIMPLE_KEY", DefaultLanguageHighlighterColors.KEYWORD);
	public static final TextAttributesKey VALUE =
			createTextAttributesKey("SIMPLE_VALUE", DefaultLanguageHighlighterColors.STRING);
	public static final TextAttributesKey COMMENT =
			createTextAttributesKey("SIMPLE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
	public static final TextAttributesKey BAD_CHARACTER =
			createTextAttributesKey("SIMPLE_BAD_CHARACTER", HighlighterColors.BAD_CHARACTER);

	private static final TextAttributesKey[] BAD_CHAR_KEYS = new TextAttributesKey[]{BAD_CHARACTER};
	private static final TextAttributesKey[] SEPARATOR_KEYS = new TextAttributesKey[]{SEPARATOR};
	private static final TextAttributesKey[] KEY_KEYS = new TextAttributesKey[]{KEY};
	private static final TextAttributesKey[] VALUE_KEYS = new TextAttributesKey[]{VALUE};
	private static final TextAttributesKey[] COMMENT_KEYS = new TextAttributesKey[]{COMMENT};
	private static final TextAttributesKey[] EMPTY_KEYS = new TextAttributesKey[0];

	@NotNull
	@Override
	public Lexer getHighlightingLexer() {
		return new ScriptLexerAdapter();
	}

	@NotNull
	@Override
	public TextAttributesKey[] getTokenHighlights(IElementType tokenType) {
		if (tokenType.equals(ScriptTypes.SEPARATOR)) {
			return SEPARATOR_KEYS;
		} else if (tokenType.equals(ScriptTypes.KEY)) {
			return KEY_KEYS;
		} else if (tokenType.equals(ScriptTypes.VALUE)) {
			return VALUE_KEYS;
		} else if (tokenType.equals(ScriptTypes.COMMENT)) {
			return COMMENT_KEYS;
		} else if (tokenType.equals(TokenType.BAD_CHARACTER)) {
			return BAD_CHAR_KEYS;
		} else {
			return EMPTY_KEYS;
		}
	}
}