package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PlaceholderText extends Message {
    public static final String DEFAULT_TEXT = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    public static final class Builder extends Message.Builder<PlaceholderText> {
        public String text;

        public Builder() {
        }

        public Builder(PlaceholderText placeholderText) {
            super(placeholderText);
            if (placeholderText == null) {
                return;
            }
            this.text = placeholderText.text;
        }

        @Override // com.squareup.wire.Message.Builder
        public PlaceholderText build(boolean z) {
            return new PlaceholderText(this, z);
        }
    }

    public PlaceholderText(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
                return;
            } else {
                this.text = str;
                return;
            }
        }
        this.text = builder.text;
    }
}