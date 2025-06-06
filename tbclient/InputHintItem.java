package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class InputHintItem extends Message {
    public static final List<InputHintContent> DEFAULT_CONTENT = Collections.emptyList();
    public static final String DEFAULT_TYPE = "";

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<InputHintContent> content;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String type;

    public static final class Builder extends Message.Builder<InputHintItem> {
        public List<InputHintContent> content;
        public String type;

        public Builder() {
        }

        public Builder(InputHintItem inputHintItem) {
            super(inputHintItem);
            if (inputHintItem == null) {
                return;
            }
            this.type = inputHintItem.type;
            this.content = Message.copyOf(inputHintItem.content);
        }

        @Override // com.squareup.wire.Message.Builder
        public InputHintItem build(boolean z) {
            return new InputHintItem(this, z);
        }
    }

    public InputHintItem(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.type;
            if (str == null) {
                this.type = "";
            } else {
                this.type = str;
            }
            List<InputHintContent> list = builder.content;
            if (list == null) {
                this.content = DEFAULT_CONTENT;
                return;
            } else {
                this.content = Message.immutableCopyOf(list);
                return;
            }
        }
        this.type = builder.type;
        this.content = Message.immutableCopyOf(builder.content);
    }
}