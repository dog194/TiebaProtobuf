package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedLoopReplyComponent extends Message {

    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer loop_duration;

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<FeedInnerReplyComponent> reply_list;
    public static final List<FeedInnerReplyComponent> DEFAULT_REPLY_LIST = Collections.emptyList();
    public static final Integer DEFAULT_LOOP_DURATION = 0;

    public static final class Builder extends Message.Builder<FeedLoopReplyComponent> {
        public Integer loop_duration;
        public List<FeedInnerReplyComponent> reply_list;

        public Builder() {
        }

        public Builder(FeedLoopReplyComponent feedLoopReplyComponent) {
            super(feedLoopReplyComponent);
            if (feedLoopReplyComponent == null) {
                return;
            }
            this.reply_list = Message.copyOf(feedLoopReplyComponent.reply_list);
            this.loop_duration = feedLoopReplyComponent.loop_duration;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedLoopReplyComponent build(boolean z) {
            return new FeedLoopReplyComponent(this, z);
        }
    }

    public FeedLoopReplyComponent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<FeedInnerReplyComponent> list = builder.reply_list;
            if (list == null) {
                this.reply_list = DEFAULT_REPLY_LIST;
            } else {
                this.reply_list = Message.immutableCopyOf(list);
            }
            Integer num = builder.loop_duration;
            if (num == null) {
                this.loop_duration = DEFAULT_LOOP_DURATION;
                return;
            } else {
                this.loop_duration = num;
                return;
            }
        }
        this.reply_list = Message.immutableCopyOf(builder.reply_list);
        this.loop_duration = builder.loop_duration;
    }
}