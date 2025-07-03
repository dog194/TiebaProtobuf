package tbclient.AdBid;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.AlaLiveInfo;
import tbclient.BannerList;
import tbclient.User;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final List<User> DEFAULT_USER_LIST = Collections.emptyList();

    @ProtoField(tag = 1)
    public final BannerList banner_list;

    @ProtoField(tag = 2)
    public final AlaLiveInfo recom_ala_info;

    @ProtoField(label = Message.Label.REPEATED, tag = 3)
    public final List<User> user_list;

    public static final class Builder extends Message.Builder<DataRes> {
        public BannerList banner_list;
        public AlaLiveInfo recom_ala_info;
        public List<User> user_list;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.banner_list = dataRes.banner_list;
            this.recom_ala_info = dataRes.recom_ala_info;
            this.user_list = Message.copyOf(dataRes.user_list);
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.banner_list = builder.banner_list;
            this.recom_ala_info = builder.recom_ala_info;
            List<User> list = builder.user_list;
            if (list == null) {
                this.user_list = DEFAULT_USER_LIST;
                return;
            } else {
                this.user_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.banner_list = builder.banner_list;
        this.recom_ala_info = builder.recom_ala_info;
        this.user_list = Message.immutableCopyOf(builder.user_list);
    }
}