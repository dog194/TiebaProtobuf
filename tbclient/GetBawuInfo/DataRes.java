package tbclient.GetBawuInfo;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.BawuTeam;
import tbclient.Feedback;

/* loaded from: classes4.dex */
public final class DataRes extends Message {
    public static final Integer DEFAULT_IS_PRIVATE_FORUM = 0;

    @ProtoField(tag = 1)
    public final BawuTeam bawu_team_info;

    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer is_private_forum;

    @ProtoField(tag = 2)
    public final ManagerApplyInfo manager_apply_info;

    @ProtoField(tag = 4)
    public final Feedback manager_complain_info;

    public static final class Builder extends Message.Builder<DataRes> {
        public BawuTeam bawu_team_info;
        public Integer is_private_forum;
        public ManagerApplyInfo manager_apply_info;
        public Feedback manager_complain_info;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.bawu_team_info = dataRes.bawu_team_info;
            this.manager_apply_info = dataRes.manager_apply_info;
            this.is_private_forum = dataRes.is_private_forum;
            this.manager_complain_info = dataRes.manager_complain_info;
        }

        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.bawu_team_info = builder.bawu_team_info;
            this.manager_apply_info = builder.manager_apply_info;
            Integer num = builder.is_private_forum;
            if (num == null) {
                this.is_private_forum = DEFAULT_IS_PRIVATE_FORUM;
            } else {
                this.is_private_forum = num;
            }
            this.manager_complain_info = builder.manager_complain_info;
            return;
        }
        this.bawu_team_info = builder.bawu_team_info;
        this.manager_apply_info = builder.manager_apply_info;
        this.is_private_forum = builder.is_private_forum;
        this.manager_complain_info = builder.manager_complain_info;
    }
}