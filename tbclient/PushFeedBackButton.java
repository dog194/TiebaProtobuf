package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PushFeedBackButton extends Message {
    public static final String DEFAULT_BUTTON_NAME = "";
    public static final Integer DEFAULT_FEEDBACK_TYPE = 0;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String button_name;

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer feedback_type;

    public static final class Builder extends Message.Builder<PushFeedBackButton> {
        public String button_name;
        public Integer feedback_type;

        public Builder() {
        }

        public Builder(PushFeedBackButton pushFeedBackButton) {
            super(pushFeedBackButton);
            if (pushFeedBackButton == null) {
                return;
            }
            this.button_name = pushFeedBackButton.button_name;
            this.feedback_type = pushFeedBackButton.feedback_type;
        }

        @Override // com.squareup.wire.Message.Builder
        public PushFeedBackButton build(boolean z) {
            return new PushFeedBackButton(this, z);
        }
    }

    public PushFeedBackButton(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.button_name;
            if (str == null) {
                this.button_name = "";
            } else {
                this.button_name = str;
            }
            Integer num = builder.feedback_type;
            if (num == null) {
                this.feedback_type = DEFAULT_FEEDBACK_TYPE;
                return;
            } else {
                this.feedback_type = num;
                return;
            }
        }
        this.button_name = builder.button_name;
        this.feedback_type = builder.feedback_type;
    }
}