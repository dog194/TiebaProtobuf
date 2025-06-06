package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadRecommendTag extends Message {
    public static final String DEFAULT_TEXT = "";
    public static final Integer DEFAULT_TYPE = 0;

    @ProtoField(tag = 3)
    public final ThemeColorInfo background_color;

    @ProtoField(tag = 4)
    public final ThemeColorInfo boundary_color;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String text;

    @ProtoField(tag = 2)
    public final ThemeColorInfo text_color;

    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer type;

    public static final class Builder extends Message.Builder<ThreadRecommendTag> {
        public ThemeColorInfo background_color;
        public ThemeColorInfo boundary_color;
        public String text;
        public ThemeColorInfo text_color;
        public Integer type;

        public Builder() {
        }

        public Builder(ThreadRecommendTag threadRecommendTag) {
            super(threadRecommendTag);
            if (threadRecommendTag == null) {
                return;
            }
            this.text = threadRecommendTag.text;
            this.text_color = threadRecommendTag.text_color;
            this.background_color = threadRecommendTag.background_color;
            this.boundary_color = threadRecommendTag.boundary_color;
            this.type = threadRecommendTag.type;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadRecommendTag build(boolean z) {
            return new ThreadRecommendTag(this, z);
        }
    }

    public ThreadRecommendTag(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.text;
            if (str == null) {
                this.text = "";
            } else {
                this.text = str;
            }
            this.text_color = builder.text_color;
            this.background_color = builder.background_color;
            this.boundary_color = builder.boundary_color;
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
                return;
            } else {
                this.type = num;
                return;
            }
        }
        this.text = builder.text;
        this.text_color = builder.text_color;
        this.background_color = builder.background_color;
        this.boundary_color = builder.boundary_color;
        this.type = builder.type;
    }
}