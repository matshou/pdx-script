package io.yooksi.pdxs.lexer;

import com.intellij.lexer.FlexAdapter;
import io.yooksi.pdxs.ScriptLexer;

public class ScriptLexerAdapter extends FlexAdapter {

	public ScriptLexerAdapter() {
		super(new ScriptLexer(null));
	}
}