package tbclient.NewTopicList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PkModule extends Message {
    public static final Long DEFAULT_PK_ID = 0L;
    public static final Long DEFAULT_USER_PK_ID = 0L;

    @ProtoField(tag = 3)
    public final PkItem agree;

    @ProtoField(tag = 4)
    public final PkItem disagree;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long pk_id;

    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long user_pk_id;

    public static final class Builder extends Message.Builder<PkModule> {
        public PkItem agree;
        public PkItem disagree;
        public Long pk_id;
        public Long user_pk_id;

        public Builder() {
        }

        public Builder(PkModule pkModule) {
            super(pkModule);
            if (pkModule == null) {
                return;
            }
            this.pk_id = pkModule.pk_id;
            this.user_pk_id = pkModule.user_pk_id;
            this.agree = pkModule.agree;
            this.disagree = pkModule.disagree;
        }

        @Override // com.squareup.wire.Message.Builder
        public PkModule build(boolean z) {
            return new PkModule(this, z);
        }
    }

    public PkModule(Builder builder, boolean z) {
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
            } else {
                this.user_pk_id = l2;
            }
            this.agree = builder.agree;
            this.disagree = builder.disagree;
            return;
        }
        this.pk_id = builder.pk_id;
        this.user_pk_id = builder.user_pk_id;
        this.agree = builder.agree;
        this.disagree = builder.disagree;
    }
}