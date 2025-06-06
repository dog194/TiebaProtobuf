package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class BotTags extends Message {
    public static final List<BotTagInfo> DEFAULT_TAG_INFO = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BotTagInfo> tag_info;

    public static final class Builder extends Message.Builder<BotTags> {
        public List<BotTagInfo> tag_info;

        public Builder() {
        }

        public Builder(BotTags botTags) {
            super(botTags);
            if (botTags == null) {
                return;
            }
            this.tag_info = Message.copyOf(botTags.tag_info);
        }

        @Override // com.squareup.wire.Message.Builder
        public BotTags build(boolean z) {
            return new BotTags(this, z);
        }
    }

    public BotTags(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<BotTagInfo> list = builder.tag_info;
            if (list == null) {
                this.tag_info = DEFAULT_TAG_INFO;
                return;
            } else {
                this.tag_info = Message.immutableCopyOf(list);
                return;
            }
        }
        this.tag_info = Message.immutableCopyOf(builder.tag_info);
    }
}