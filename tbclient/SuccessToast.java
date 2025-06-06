package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SuccessToast extends Message {
    public static final String DEFAULT_BUTTON_SCHEMA = "";
    public static final String DEFAULT_BUTTON_TEXT = "";
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_TITLE = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String button_schema;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String button_text;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    public static final class Builder extends Message.Builder<SuccessToast> {
        public String button_schema;
        public String button_text;
        public String content;
        public String title;

        public Builder() {
        }

        public Builder(SuccessToast successToast) {
            super(successToast);
            if (successToast == null) {
                return;
            }
            this.title = successToast.title;
            this.content = successToast.content;
            this.button_text = successToast.button_text;
            this.button_schema = successToast.button_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public SuccessToast build(boolean z) {
            return new SuccessToast(this, z);
        }
    }

    public SuccessToast(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            String str3 = builder.button_text;
            if (str3 == null) {
                this.button_text = "";
            } else {
                this.button_text = str3;
            }
            String str4 = builder.button_schema;
            if (str4 == null) {
                this.button_schema = "";
                return;
            } else {
                this.button_schema = str4;
                return;
            }
        }
        this.title = builder.title;
        this.content = builder.content;
        this.button_text = builder.button_text;
        this.button_schema = builder.button_schema;
    }
}