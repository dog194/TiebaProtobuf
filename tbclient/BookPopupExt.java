package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class BookPopupExt extends Message {
    public static final String DEFAULT_APK_NAME = "";
    public static final String DEFAULT_APK_URL = "";
    public static final String DEFAULT_APP_ICON = "";
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_AUTHORITY_URL = "";
    public static final String DEFAULT_DEVELOPER = "";
    public static final String DEFAULT_GAME_ID = "";
    public static final String DEFAULT_IOS_LINK = "";
    public static final String DEFAULT_ITEM_ID = "";
    public static final String DEFAULT_PACKAGE_SIZE = "";
    public static final String DEFAULT_PACKAGE_VERSION = "";
    public static final String DEFAULT_PACKAGE_VERSION_CODE = "";
    public static final String DEFAULT_PKG_SOURCE = "";
    public static final String DEFAULT_PRIVATE_URL = "";

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String apk_name;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String apk_url;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String app_icon;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String app_name;

    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String authority_url;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String developer;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String game_id;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String ios_link;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String item_id;

    @ProtoField(tag = 13, type = Message.Datatype.STRING)
    public final String package_size;

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String package_version;

    @ProtoField(tag = 14, type = Message.Datatype.STRING)
    public final String package_version_code;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String pkg_source;

    @ProtoField(tag = 12, type = Message.Datatype.STRING)
    public final String private_url;

    public static final class Builder extends Message.Builder<BookPopupExt> {
        public String apk_name;
        public String apk_url;
        public String app_icon;
        public String app_name;
        public String authority_url;
        public String developer;
        public String game_id;
        public String ios_link;
        public String item_id;
        public String package_size;
        public String package_version;
        public String package_version_code;
        public String pkg_source;
        public String private_url;

        public Builder() {
        }

        public Builder(BookPopupExt bookPopupExt) {
            super(bookPopupExt);
            if (bookPopupExt == null) {
                return;
            }
            this.game_id = bookPopupExt.game_id;
            this.item_id = bookPopupExt.item_id;
            this.app_name = bookPopupExt.app_name;
            this.app_icon = bookPopupExt.app_icon;
            this.ios_link = bookPopupExt.ios_link;
            this.apk_url = bookPopupExt.apk_url;
            this.apk_name = bookPopupExt.apk_name;
            this.pkg_source = bookPopupExt.pkg_source;
            this.developer = bookPopupExt.developer;
            this.package_version = bookPopupExt.package_version;
            this.authority_url = bookPopupExt.authority_url;
            this.private_url = bookPopupExt.private_url;
            this.package_size = bookPopupExt.package_size;
            this.package_version_code = bookPopupExt.package_version_code;
        }

        @Override // com.squareup.wire.Message.Builder
        public BookPopupExt build(boolean z) {
            return new BookPopupExt(this, z);
        }
    }

    public BookPopupExt(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.game_id;
            if (str == null) {
                this.game_id = "";
            } else {
                this.game_id = str;
            }
            String str2 = builder.item_id;
            if (str2 == null) {
                this.item_id = "";
            } else {
                this.item_id = str2;
            }
            String str3 = builder.app_name;
            if (str3 == null) {
                this.app_name = "";
            } else {
                this.app_name = str3;
            }
            String str4 = builder.app_icon;
            if (str4 == null) {
                this.app_icon = "";
            } else {
                this.app_icon = str4;
            }
            String str5 = builder.ios_link;
            if (str5 == null) {
                this.ios_link = "";
            } else {
                this.ios_link = str5;
            }
            String str6 = builder.apk_url;
            if (str6 == null) {
                this.apk_url = "";
            } else {
                this.apk_url = str6;
            }
            String str7 = builder.apk_name;
            if (str7 == null) {
                this.apk_name = "";
            } else {
                this.apk_name = str7;
            }
            String str8 = builder.pkg_source;
            if (str8 == null) {
                this.pkg_source = "";
            } else {
                this.pkg_source = str8;
            }
            String str9 = builder.developer;
            if (str9 == null) {
                this.developer = "";
            } else {
                this.developer = str9;
            }
            String str10 = builder.package_version;
            if (str10 == null) {
                this.package_version = "";
            } else {
                this.package_version = str10;
            }
            String str11 = builder.authority_url;
            if (str11 == null) {
                this.authority_url = "";
            } else {
                this.authority_url = str11;
            }
            String str12 = builder.private_url;
            if (str12 == null) {
                this.private_url = "";
            } else {
                this.private_url = str12;
            }
            String str13 = builder.package_size;
            if (str13 == null) {
                this.package_size = "";
            } else {
                this.package_size = str13;
            }
            String str14 = builder.package_version_code;
            if (str14 == null) {
                this.package_version_code = "";
                return;
            } else {
                this.package_version_code = str14;
                return;
            }
        }
        this.game_id = builder.game_id;
        this.item_id = builder.item_id;
        this.app_name = builder.app_name;
        this.app_icon = builder.app_icon;
        this.ios_link = builder.ios_link;
        this.apk_url = builder.apk_url;
        this.apk_name = builder.apk_name;
        this.pkg_source = builder.pkg_source;
        this.developer = builder.developer;
        this.package_version = builder.package_version;
        this.authority_url = builder.authority_url;
        this.private_url = builder.private_url;
        this.package_size = builder.package_size;
        this.package_version_code = builder.package_version_code;
    }
}