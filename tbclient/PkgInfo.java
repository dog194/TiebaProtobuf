package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class PkgInfo extends Message {
    public static final String DEFAULT_ABILITY = "";
    public static final String DEFAULT_COMPANY = "";
    public static final String DEFAULT_PKG_NAME = "";
    public static final Integer DEFAULT_PKG_SOURCE = 0;
    public static final String DEFAULT_POWER = "";
    public static final String DEFAULT_PRIVACY = "";
    public static final String DEFAULT_SIZE = "";
    public static final String DEFAULT_URL = "";
    public static final String DEFAULT_VERSION = "";
    public static final String DEFAULT_VERSION_CODE = "";

    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String ability;

    @ProtoField(tag = 9, type = Message.Datatype.STRING)
    public final String company;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String pkg_name;

    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer pkg_source;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String power;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String privacy;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String size;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String version;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String version_code;

    public static final class Builder extends Message.Builder<PkgInfo> {
        public String ability;
        public String company;
        public String pkg_name;
        public Integer pkg_source;
        public String power;
        public String privacy;
        public String size;
        public String url;
        public String version;
        public String version_code;

        public Builder() {
        }

        public Builder(PkgInfo pkgInfo) {
            super(pkgInfo);
            if (pkgInfo == null) {
                return;
            }
            this.url = pkgInfo.url;
            this.version = pkgInfo.version;
            this.size = pkgInfo.size;
            this.version_code = pkgInfo.version_code;
            this.pkg_name = pkgInfo.pkg_name;
            this.pkg_source = pkgInfo.pkg_source;
            this.privacy = pkgInfo.privacy;
            this.power = pkgInfo.power;
            this.company = pkgInfo.company;
            this.ability = pkgInfo.ability;
        }

        @Override // com.squareup.wire.Message.Builder
        public PkgInfo build(boolean z) {
            return new PkgInfo(this, z);
        }
    }

    public PkgInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.version;
            if (str2 == null) {
                this.version = "";
            } else {
                this.version = str2;
            }
            String str3 = builder.size;
            if (str3 == null) {
                this.size = "";
            } else {
                this.size = str3;
            }
            String str4 = builder.version_code;
            if (str4 == null) {
                this.version_code = "";
            } else {
                this.version_code = str4;
            }
            String str5 = builder.pkg_name;
            if (str5 == null) {
                this.pkg_name = "";
            } else {
                this.pkg_name = str5;
            }
            Integer num = builder.pkg_source;
            if (num == null) {
                this.pkg_source = DEFAULT_PKG_SOURCE;
            } else {
                this.pkg_source = num;
            }
            String str6 = builder.privacy;
            if (str6 == null) {
                this.privacy = "";
            } else {
                this.privacy = str6;
            }
            String str7 = builder.power;
            if (str7 == null) {
                this.power = "";
            } else {
                this.power = str7;
            }
            String str8 = builder.company;
            if (str8 == null) {
                this.company = "";
            } else {
                this.company = str8;
            }
            String str9 = builder.ability;
            if (str9 == null) {
                this.ability = "";
                return;
            } else {
                this.ability = str9;
                return;
            }
        }
        this.url = builder.url;
        this.version = builder.version;
        this.size = builder.size;
        this.version_code = builder.version_code;
        this.pkg_name = builder.pkg_name;
        this.pkg_source = builder.pkg_source;
        this.privacy = builder.privacy;
        this.power = builder.power;
        this.company = builder.company;
        this.ability = builder.ability;
    }
}