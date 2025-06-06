package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PrefetchInfo extends Message {
    public static final String DEFAULT_PREFETCH_SCHEMA = "";
    public static final Long DEFAULT_THREAD_ID = 0L;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String prefetch_schema;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long thread_id;

    public static final class Builder extends Message.Builder<PrefetchInfo> {
        public String prefetch_schema;
        public Long thread_id;

        public Builder() {
        }

        public Builder(PrefetchInfo prefetchInfo) {
            super(prefetchInfo);
            if (prefetchInfo == null) {
                return;
            }
            this.thread_id = prefetchInfo.thread_id;
            this.prefetch_schema = prefetchInfo.prefetch_schema;
        }

        @Override // com.squareup.wire.Message.Builder
        public PrefetchInfo build(boolean z) {
            return new PrefetchInfo(this, z);
        }
    }

    public PrefetchInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.thread_id;
            if (l == null) {
                this.thread_id = DEFAULT_THREAD_ID;
            } else {
                this.thread_id = l;
            }
            String str = builder.prefetch_schema;
            if (str == null) {
                this.prefetch_schema = "";
                return;
            } else {
                this.prefetch_schema = str;
                return;
            }
        }
        this.thread_id = builder.thread_id;
        this.prefetch_schema = builder.prefetch_schema;
    }
}