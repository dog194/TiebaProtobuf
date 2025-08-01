package tbclient.UserPk;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_USER_PK_ID = 0L;

    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long pk_id;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_pk_id;

    public static final class Builder extends Message.Builder<DataRes> {
        public Long pk_id;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.pk_id = dataRes.pk_id;
            this.user_pk_id = dataRes.user_pk_id;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.pk_id;
            if (l == null) {
                this.pk_id = DEFAULT_PK_ID;
            } else {
                this.pk_id = l;
            }
            Long l2 = builder.user_pk_id;
            if (l2 == null) {
                this.user_pk_id = DEFAULT_USER_PK_ID;
                return;
            } else {
                this.user_pk_id = l2;
                return;
            }
        }
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
    }
}