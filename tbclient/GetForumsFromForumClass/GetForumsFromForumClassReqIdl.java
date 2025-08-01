package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class GetForumsFromForumClassReqIdl extends Message {

    @ProtoField(tag = 1)
    public final DataReq data;

    public static final class Builder extends Message.Builder<GetForumsFromForumClassReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(GetForumsFromForumClassReqIdl getForumsFromForumClassReqIdl) {
            super(getForumsFromForumClassReqIdl);
            if (getForumsFromForumClassReqIdl == null) {
                return;
            }
            this.data = getForumsFromForumClassReqIdl.data;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumsFromForumClassReqIdl build(boolean z) {
            return new GetForumsFromForumClassReqIdl(this, z);
        }
    }

    public GetForumsFromForumClassReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }
}