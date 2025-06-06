package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Danmaku extends Message {
    public static final List<FeedHeadSymbol> DEFAULT_MAIN_DATA = Collections.emptyList();

    @ProtoField(tag = 1)
    public final FeedHeadImg image_data;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedHeadSymbol> main_data;

    public static final class Builder extends Message.Builder<Danmaku> {
        public FeedHeadImg image_data;
        public List<FeedHeadSymbol> main_data;

        public Builder() {
        }

        public Builder(Danmaku danmaku) {
            super(danmaku);
            if (danmaku == null) {
                return;
            }
            this.image_data = danmaku.image_data;
            this.main_data = Message.copyOf(danmaku.main_data);
        }

        @Override // com.squareup.wire.Message.Builder
        public Danmaku build(boolean z) {
            return new Danmaku(this, z);
        }
    }

    public Danmaku(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.image_data = builder.image_data;
            List<FeedHeadSymbol> list = builder.main_data;
            if (list == null) {
                this.main_data = DEFAULT_MAIN_DATA;
                return;
            } else {
                this.main_data = Message.immutableCopyOf(list);
                return;
            }
        }
        this.image_data = builder.image_data;
        this.main_data = Message.immutableCopyOf(builder.main_data);
    }
}