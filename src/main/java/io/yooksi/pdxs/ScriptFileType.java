package io.yooksi.pdxs;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.*;

import javax.swing.*;

public class ScriptFileType extends LanguageFileType {
	public static final ScriptFileType INSTANCE = new ScriptFileType();

	private ScriptFileType() {
		super(ScriptLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public String getName() {
		return "Paradox Script";
	}

	@NotNull
	@Override
	public String getDescription() {
		return getName();
	}

	@NotNull
	@Override
	public String getDefaultExtension() {
		return "pdxs";
	}

	@Nullable
	@Override
	public Icon getIcon() {
		return ScriptIcons.FILE;
	}
}