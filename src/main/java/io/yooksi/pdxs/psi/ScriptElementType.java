package io.yooksi.pdxs.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class ScriptElementType extends IElementType {
	public ScriptElementType(@NotNull @NonNls String debugName) {
		super(debugName, io.yooksi.pdxs.ScriptLanguage.INSTANCE);
	}
}
