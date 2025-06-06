package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class AuxiliaryAllTools extends Message {
    public static final String DEFAULT_CLASS = "";
    public static final List<AuxiliaryToolsInfo> DEFAULT_TOOLS = Collections.emptyList();

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String _class;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<AuxiliaryToolsInfo> tools;

    public static final class Builder extends Message.Builder<AuxiliaryAllTools> {
        public String _class;
        public List<AuxiliaryToolsInfo> tools;

        public Builder() {
        }

        public Builder(AuxiliaryAllTools auxiliaryAllTools) {
            super(auxiliaryAllTools);
            if (auxiliaryAllTools == null) {
                return;
            }
            this.tools = Message.copyOf(auxiliaryAllTools.tools);
            this._class = auxiliaryAllTools._class;
        }

        @Override // com.squareup.wire.Message.Builder
        public AuxiliaryAllTools build(boolean z) {
            return new AuxiliaryAllTools(this, z);
        }
    }

    public AuxiliaryAllTools(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<AuxiliaryToolsInfo> list = builder.tools;
            if (list == null) {
                this.tools = DEFAULT_TOOLS;
            } else {
                this.tools = Message.immutableCopyOf(list);
            }
            String str = builder._class;
            if (str == null) {
                this._class = "";
                return;
            } else {
                this._class = str;
                return;
            }
        }
        this.tools = Message.immutableCopyOf(builder.tools);
        this._class = builder._class;
    }
}