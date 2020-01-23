package io.yooksi.pdxs.lexer;

import com.intellij.lexer.FlexAdapter;

public class ScriptLexerAdapter extends FlexAdapter {

	public ScriptLexerAdapter() {
		super(new ScriptLexer(null));
	}
}