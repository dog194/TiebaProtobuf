package tbclient.Loop;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class SidebarMsg extends Message {
    public static final String DEFAULT_VIPBANNER_BUBBLE = "";

    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long member_expired_time;

    @ProtoField(tag = 1, type = Message.Datatype.BOOL)
    public final Boolean member_has_expired;

    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer task_page_sign_status;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String vipbanner_bubble;
    public static final Boolean DEFAULT_MEMBER_HAS_EXPIRED = Boolean.FALSE;
    public static final Long DEFAULT_MEMBER_EXPIRED_TIME = 0L;
    public static final Integer DEFAULT_TASK_PAGE_SIGN_STATUS = 0;

    public static final class Builder extends Message.Builder<SidebarMsg> {
        public Long member_expired_time;
        public Boolean member_has_expired;
        public Integer task_page_sign_status;
        public String vipbanner_bubble;

        public Builder() {
        }

        public Builder(SidebarMsg sidebarMsg) {
            super(sidebarMsg);
            if (sidebarMsg == null) {
                return;
            }
            this.member_has_expired = sidebarMsg.member_has_expired;
            this.vipbanner_bubble = sidebarMsg.vipbanner_bubble;
            this.member_expired_time = sidebarMsg.member_expired_time;
            this.task_page_sign_status = sidebarMsg.task_page_sign_status;
        }

        @Override // com.squareup.wire.Message.Builder
        public SidebarMsg build(boolean z) {
            return new SidebarMsg(this, z);
        }
    }

    public SidebarMsg(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Boolean bool = builder.member_has_expired;
            if (bool == null) {
                this.member_has_expired = DEFAULT_MEMBER_HAS_EXPIRED;
            } else {
                this.member_has_expired = bool;
            }
            String str = builder.vipbanner_bubble;
            if (str == null) {
                this.vipbanner_bubble = "";
            } else {
                this.vipbanner_bubble = str;
            }
            Long l = builder.member_expired_time;
            if (l == null) {
                this.member_expired_time = DEFAULT_MEMBER_EXPIRED_TIME;
            } else {
                this.member_expired_time = l;
            }
            Integer num = builder.task_page_sign_status;
            if (num == null) {
                this.task_page_sign_status = DEFAULT_TASK_PAGE_SIGN_STATUS;
                return;
            } else {
                this.task_page_sign_status = num;
                return;
            }
        }
        this.member_has_expired = builder.member_has_expired;
        this.vipbanner_bubble = builder.vipbanner_bubble;
        this.member_expired_time = builder.member_expired_time;
        this.task_page_sign_status = builder.task_page_sign_status;
    }
}