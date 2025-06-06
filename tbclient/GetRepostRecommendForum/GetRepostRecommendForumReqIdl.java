package tbclient.GetRepostRecommendForum;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetRepostRecommendForumReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetRepostRecommendForumReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetRepostRecommendForumReqIdl getRepostRecommendForumReqIdl) {
            super(getRepostRecommendForumReqIdl);
            if (getRepostRecommendForumReqIdl == null) {
                return;
            }
            this.data = getRepostRecommendForumReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetRepostRecommendForumReqIdl build(boolean z) {
            return new GetRepostRecommendForumReqIdl(this, z);
        }
    }

    public GetRepostRecommendForumReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}