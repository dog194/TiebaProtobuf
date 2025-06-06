package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class FeedDanmaku extends Message {
    public static final List<Danmaku> DEFAULT_DANMAKU = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<Danmaku> danmaku;

    public static final class Builder extends Message.Builder<FeedDanmaku> {
        public List<Danmaku> danmaku;

        public Builder() {
        }

        public Builder(FeedDanmaku feedDanmaku) {
            super(feedDanmaku);
            if (feedDanmaku == null) {
                return;
            }
            this.danmaku = Message.copyOf(feedDanmaku.danmaku);
        }

        @Override // com.squareup.wire.Message.Builder
        public FeedDanmaku build(boolean z) {
            return new FeedDanmaku(this, z);
        }
    }

    public FeedDanmaku(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<Danmaku> list = builder.danmaku;
            if (list == null) {
                this.danmaku = DEFAULT_DANMAKU;
                return;
            } else {
                this.danmaku = Message.immutableCopyOf(list);
                return;
            }
        }
        this.danmaku = Message.immutableCopyOf(builder.danmaku);
    }
}