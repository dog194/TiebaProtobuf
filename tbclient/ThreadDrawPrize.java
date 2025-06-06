package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ThreadDrawPrize extends Message {
    public static final String DEFAULT_ASSET = "";
    public static final Long DEFAULT_COUNT = 0L;
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_PIC = "";

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String asset;

    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long count;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String pic;

    public static final class Builder extends Message.Builder<ThreadDrawPrize> {
        public String asset;
        public Long count;
        public String name;
        public String pic;

        public Builder() {
        }

        public Builder(ThreadDrawPrize threadDrawPrize) {
            super(threadDrawPrize);
            if (threadDrawPrize == null) {
                return;
            }
            this.name = threadDrawPrize.name;
            this.pic = threadDrawPrize.pic;
            this.count = threadDrawPrize.count;
            this.asset = threadDrawPrize.asset;
        }

        @Override // com.squareup.wire.Message.Builder
        public ThreadDrawPrize build(boolean z) {
            return new ThreadDrawPrize(this, z);
        }
    }

    public ThreadDrawPrize(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.pic;
            if (str2 == null) {
                this.pic = "";
            } else {
                this.pic = str2;
            }
            Long l = builder.count;
            if (l == null) {
                this.count = DEFAULT_COUNT;
            } else {
                this.count = l;
            }
            String str3 = builder.asset;
            if (str3 == null) {
                this.asset = "";
                return;
            } else {
                this.asset = str3;
                return;
            }
        }
        this.name = builder.name;
        this.pic = builder.pic;
        this.count = builder.count;
        this.asset = builder.asset;
    }
}