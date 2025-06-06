package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SuggestQuery extends Message {

    @ProtoField(tag = 2)
    public final QueryInfo rela_querys;

    @ProtoField(tag = 1)
    public final QueryInfo sub_querys;

    public static final class Builder extends Message.Builder<SuggestQuery> {
        public QueryInfo rela_querys;
        public QueryInfo sub_querys;

        public Builder() {
        }

        public Builder(SuggestQuery suggestQuery) {
            super(suggestQuery);
            if (suggestQuery == null) {
                return;
            }
            this.sub_querys = suggestQuery.sub_querys;
            this.rela_querys = suggestQuery.rela_querys;
        }

        @Override // com.squareup.wire.Message.Builder
        public SuggestQuery build(boolean z) {
            return new SuggestQuery(this, z);
        }
    }

    public SuggestQuery(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.sub_querys = builder.sub_querys;
            this.rela_querys = builder.rela_querys;
        } else {
            this.sub_querys = builder.sub_querys;
            this.rela_querys = builder.rela_querys;
        }
    }
}