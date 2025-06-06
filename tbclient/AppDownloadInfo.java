package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class AppDownloadInfo extends Message {
    public static final String DEFAULT_APP_NAME = "";
    public static final String DEFAULT_APP_VERSION = "";
    public static final String DEFAULT_AUTHORITY_URL = "";
    public static final String DEFAULT_DEVELOPER_NAME = "";
    public static final String DEFAULT_FUNC_URL = "";
    public static final String DEFAULT_PRIVACY_URL = "";

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String app_name;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String app_version;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String authority_url;

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String developer_name;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String func_url;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String privacy_url;

    public static final class Builder extends Message.Builder<AppDownloadInfo> {
        public String app_name;
        public String app_version;
        public String authority_url;
        public String developer_name;
        public String func_url;
        public String privacy_url;

        public Builder() {
        }

        public Builder(AppDownloadInfo appDownloadInfo) {
            super(appDownloadInfo);
            if (appDownloadInfo == null) {
                return;
            }
            this.app_name = appDownloadInfo.app_name;
            this.app_version = appDownloadInfo.app_version;
            this.developer_name = appDownloadInfo.developer_name;
            this.authority_url = appDownloadInfo.authority_url;
            this.privacy_url = appDownloadInfo.privacy_url;
            this.func_url = appDownloadInfo.func_url;
        }

        @Override // com.squareup.wire.Message.Builder
        public AppDownloadInfo build(boolean z) {
            return new AppDownloadInfo(this, z);
        }
    }

    public AppDownloadInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.app_name;
            if (str == null) {
                this.app_name = "";
            } else {
                this.app_name = str;
            }
            String str2 = builder.app_version;
            if (str2 == null) {
                this.app_version = "";
            } else {
                this.app_version = str2;
            }
            String str3 = builder.developer_name;
            if (str3 == null) {
                this.developer_name = "";
            } else {
                this.developer_name = str3;
            }
            String str4 = builder.authority_url;
            if (str4 == null) {
                this.authority_url = "";
            } else {
                this.authority_url = str4;
            }
            String str5 = builder.privacy_url;
            if (str5 == null) {
                this.privacy_url = "";
            } else {
                this.privacy_url = str5;
            }
            String str6 = builder.func_url;
            if (str6 == null) {
                this.func_url = "";
                return;
            } else {
                this.func_url = str6;
                return;
            }
        }
        this.app_name = builder.app_name;
        this.app_version = builder.app_version;
        this.developer_name = builder.developer_name;
        this.authority_url = builder.authority_url;
        this.privacy_url = builder.privacy_url;
        this.func_url = builder.func_url;
    }
}