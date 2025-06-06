package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class InputHintContent extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final String DEFAULT_TYPE = "";

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    public static final class Builder extends Message.Builder<InputHintContent> {
        public String text;
        public String type;

        public Builder() {
        }

        public Builder(InputHintContent inputHintContent) {
            super(inputHintContent);
            if (inputHintContent == null) {
                return;
            }
            this.type = inputHintContent.type;
            this.text = inputHintContent.text;
        }

        @Override // com.squareup.wire.Message.Builder
        public InputHintContent build(boolean z) {
            return new InputHintContent(this, z);
        }
    }

    public InputHintContent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            String str2 = builder.text;
            if (str2 == null) {
                this.text = "";
                return;
            } else {
                this.text = str2;
                return;
            }
        }
        this.type = builder.type;
        this.text = builder.text;
    }
}