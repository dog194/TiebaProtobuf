package tbclient.SearchPostForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SearchPostForumReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<SearchPostForumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(SearchPostForumReqIdl searchPostForumReqIdl) {
            super(searchPostForumReqIdl);
            if (searchPostForumReqIdl == null) {
                return;
            }
            this.data = searchPostForumReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public SearchPostForumReqIdl build(boolean z) {
            return new SearchPostForumReqIdl(this, z);
        }
    }

    public SearchPostForumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}