package io.yooksi.pdxs;

import com.intellij.lang.Language;

public class ScriptLanguage extends Language {
	public static final ScriptLanguage INSTANCE = new ScriptLanguage();

	private ScriptLanguage() {
		super("PdxScript");
	}
}