package io.yooksi.pdxs.psi;

import com.intellij.extapi.psi.PsiFileBase;
import com.intellij.openapi.fileTypes.FileType;
import com.intellij.psi.FileViewProvider;
import io.yooksi.pdxs.ScriptFileType;
import io.yooksi.pdxs.ScriptLanguage;
import org.jetbrains.annotations.NotNull;

import javax.swing.*;

public class ScriptFile extends PsiFileBase {

	public ScriptFile(@NotNull FileViewProvider viewProvider) {
		super(viewProvider, ScriptLanguage.INSTANCE);
	}

	@NotNull
	@Override
	public FileType getFileType() {
		return ScriptFileType.INSTANCE;
	}

	@Override
	public String toString() {
		return "Paradox Script File";
	}

	@Override
	public Icon getIcon(int flags) {
		return super.getIcon(flags);
	}
}