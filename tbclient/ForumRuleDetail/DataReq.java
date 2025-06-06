package tbclient.ForumRuleDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;

/* loaded from: classes4.dex */
public final class DataReq extends Message {

    /* renamed from: common, reason: collision with root package name */
    @ProtoField(tag = 2)
    public final CommonReq f1356common;

    @ProtoField(tag = 4, type = Message.Datatype.INT64)
    public final Long customize_rule_version;

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long default_rule_version;

    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long forum_id;

    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long is_edit;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Long DEFAULT_DEFAULT_RULE_VERSION = 0L;
    public static final Long DEFAULT_CUSTOMIZE_RULE_VERSION = 0L;
    public static final Long DEFAULT_IS_EDIT = 0L;

    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common, reason: collision with root package name */
        public CommonReq f1357common;
        public Long customize_rule_version;
        public Long default_rule_version;
        public Long forum_id;
        public Long is_edit;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.forum_id = dataReq.forum_id;
            this.f1357common = dataReq.f1356common;
            this.default_rule_version = dataReq.default_rule_version;
            this.customize_rule_version = dataReq.customize_rule_version;
            this.is_edit = dataReq.is_edit;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.forum_id;
            if (l == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = l;
            }
            this.f1356common = builder.f1357common;
            Long l2 = builder.default_rule_version;
            if (l2 == null) {
                this.default_rule_version = DEFAULT_DEFAULT_RULE_VERSION;
            } else {
                this.default_rule_version = l2;
            }
            Long l3 = builder.customize_rule_version;
            if (l3 == null) {
                this.customize_rule_version = DEFAULT_CUSTOMIZE_RULE_VERSION;
            } else {
                this.customize_rule_version = l3;
            }
            Long l4 = builder.is_edit;
            if (l4 == null) {
                this.is_edit = DEFAULT_IS_EDIT;
                return;
            } else {
                this.is_edit = l4;
                return;
            }
        }
        this.forum_id = builder.forum_id;
        this.f1356common = builder.f1357common;
        this.default_rule_version = builder.default_rule_version;
        this.customize_rule_version = builder.customize_rule_version;
        this.is_edit = builder.is_edit;
    }
}