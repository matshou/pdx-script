package io.yooksi.pdxs.psi;

import com.intellij.psi.tree.IElementType;
import org.jetbrains.annotations.*;

public class ScriptTokenType extends IElementType {
	public ScriptTokenType(@NotNull @NonNls String debugName) {
		super(debugName, io.yooksi.pdxs.ScriptLanguage.INSTANCE);
	}

	@Override
	public String toString() {
		return "ScriptTokenType." + super.toString();
	}
}