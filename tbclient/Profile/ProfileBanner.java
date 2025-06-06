package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.BannerImage;
import tbclient.FeedKV;

/* loaded from: classes4.dex */
public final class ProfileBanner extends Message {
    public static final List<BannerImage> DEFAULT_BANNER_LIST = Collections.emptyList();
    public static final List<FeedKV> DEFAULT_LOG_PARAM = Collections.emptyList();

    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<BannerImage> banner_list;

    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<FeedKV> log_param;

    public static final class Builder extends Message.Builder<ProfileBanner> {
        public List<BannerImage> banner_list;
        public List<FeedKV> log_param;

        public Builder() {
        }

        public Builder(ProfileBanner profileBanner) {
            super(profileBanner);
            if (profileBanner == null) {
                return;
            }
            this.banner_list = Message.copyOf(profileBanner.banner_list);
            this.log_param = Message.copyOf(profileBanner.log_param);
        }

        @Override // com.squareup.wire.Message.Builder
        public ProfileBanner build(boolean z) {
            return new ProfileBanner(this, z);
        }
    }

    public ProfileBanner(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<BannerImage> list = builder.banner_list;
            if (list == null) {
                this.banner_list = DEFAULT_BANNER_LIST;
            } else {
                this.banner_list = Message.immutableCopyOf(list);
            }
            List<FeedKV> list2 = builder.log_param;
            if (list2 == null) {
                this.log_param = DEFAULT_LOG_PARAM;
                return;
            } else {
                this.log_param = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.banner_list = Message.immutableCopyOf(builder.banner_list);
        this.log_param = Message.immutableCopyOf(builder.log_param);
    }
}