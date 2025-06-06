package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class JumpText extends Message {
    public static final String DEFAULT_SCHEMA = "";
    public static final String DEFAULT_TEXT = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String schema;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    public static final class Builder extends Message.Builder<JumpText> {
        public String schema;
        public String text;

        public Builder() {
        }

        public Builder(JumpText jumpText) {
            super(jumpText);
            if (jumpText == null) {
                return;
            }
            this.text = jumpText.text;
            this.schema = jumpText.schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public JumpText build(boolean z) {
            return new JumpText(this, z);
        }
    }

    public JumpText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            String str2 = builder.schema;
            if (str2 == null) {
                this.schema = "";
                return;
            } else {
                this.schema = str2;
                return;
            }
        }
        this.text = builder.text;
        this.schema = builder.schema;
    }
}