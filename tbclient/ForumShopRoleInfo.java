package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class ForumShopRoleInfo extends Message {
    public static final String DEFAULT_LEVEL_NAME = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_ROLE_TAG = "";
    public static final String DEFAULT_USER_NAME = "";

    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer forum_level;

    @ProtoField(tag = 7)
    public final ThemeColorInfo icon_info;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String level_name;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String portrait;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String role_tag;

    @ProtoField(tag = 4, type = Message.Datatype.UINT64)
    public final Long user_id;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String user_name;
    public static final Long DEFAULT_USER_ID = 0L;
    public static final Integer DEFAULT_FORUM_LEVEL = 0;

    public static final class Builder extends Message.Builder<ForumShopRoleInfo> {
        public Integer forum_level;
        public ThemeColorInfo icon_info;
        public String level_name;
        public String portrait;
        public String role_tag;
        public Long user_id;
        public String user_name;

        public Builder() {
        }

        public Builder(ForumShopRoleInfo forumShopRoleInfo) {
            super(forumShopRoleInfo);
            if (forumShopRoleInfo == null) {
                return;
            }
            this.user_name = forumShopRoleInfo.user_name;
            this.portrait = forumShopRoleInfo.portrait;
            this.role_tag = forumShopRoleInfo.role_tag;
            this.user_id = forumShopRoleInfo.user_id;
            this.forum_level = forumShopRoleInfo.forum_level;
            this.level_name = forumShopRoleInfo.level_name;
            this.icon_info = forumShopRoleInfo.icon_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public ForumShopRoleInfo build(boolean z) {
            return new ForumShopRoleInfo(this, z);
        }
    }

    public ForumShopRoleInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.user_name;
            if (str == null) {
                this.user_name = "";
            } else {
                this.user_name = str;
            }
            String str2 = builder.portrait;
            if (str2 == null) {
                this.portrait = "";
            } else {
                this.portrait = str2;
            }
            String str3 = builder.role_tag;
            if (str3 == null) {
                this.role_tag = "";
            } else {
                this.role_tag = str3;
            }
            Long l = builder.user_id;
            if (l == null) {
                this.user_id = DEFAULT_USER_ID;
            } else {
                this.user_id = l;
            }
            Integer num = builder.forum_level;
            if (num == null) {
                this.forum_level = DEFAULT_FORUM_LEVEL;
            } else {
                this.forum_level = num;
            }
            String str4 = builder.level_name;
            if (str4 == null) {
                this.level_name = "";
            } else {
                this.level_name = str4;
            }
            this.icon_info = builder.icon_info;
            return;
        }
        this.user_name = builder.user_name;
        this.portrait = builder.portrait;
        this.role_tag = builder.role_tag;
        this.user_id = builder.user_id;
        this.forum_level = builder.forum_level;
        this.level_name = builder.level_name;
        this.icon_info = builder.icon_info;
    }
}