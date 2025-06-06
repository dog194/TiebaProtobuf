package tbclient.GetForumsFromForumClass;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;

/* loaded from: classes4.dex */
public final class GetForumsFromForumClassResIdl extends Message {

    @ProtoField(tag = 1)
    public final DataRes data;

    @ProtoField(tag = 2)
    public final Error error;

    public static final class Builder extends Message.Builder<GetForumsFromForumClassResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(GetForumsFromForumClassResIdl getForumsFromForumClassResIdl) {
            super(getForumsFromForumClassResIdl);
            if (getForumsFromForumClassResIdl == null) {
                return;
            }
            this.data = getForumsFromForumClassResIdl.data;
            this.error = getForumsFromForumClassResIdl.error;
        }

        @Override // com.squareup.wire.Message.Builder
        public GetForumsFromForumClassResIdl build(boolean z) {
            return new GetForumsFromForumClassResIdl(this, z);
        }
    }

    public GetForumsFromForumClassResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
            this.error = builder.error;
        } else {
            this.data = builder.data;
            this.error = builder.error;
        }
    }
}