package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;

/* loaded from: classes4.dex */
public final class FeatureCardCompetitionSubNode extends Message {
    public static final String DEFAULT_COMPETITION_IMAGE = "";
    public static final String DEFAULT_COMPETITION_LOGO = "";
    public static final String DEFAULT_TEAM1_IMAGE = "";
    public static final String DEFAULT_TEAM1_NAME = "";
    public static final String DEFAULT_TEAM2_IMAGE = "";
    public static final String DEFAULT_TEAM2_NAME = "";
    public static final String DEFAULT_TITLE = "";
    public static final String DEFAULT_URL = "";

    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String competition_image;

    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String competition_logo;

    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String team1_image;

    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String team1_name;

    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String team2_image;

    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String team2_name;

    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    public static final class Builder extends Message.Builder<FeatureCardCompetitionSubNode> {
        public String competition_image;
        public String competition_logo;
        public String team1_image;
        public String team1_name;
        public String team2_image;
        public String team2_name;
        public String title;
        public String url;

        public Builder() {
        }

        public Builder(FeatureCardCompetitionSubNode featureCardCompetitionSubNode) {
            super(featureCardCompetitionSubNode);
            if (featureCardCompetitionSubNode == null) {
                return;
            }
            this.title = featureCardCompetitionSubNode.title;
            this.url = featureCardCompetitionSubNode.url;
            this.competition_image = featureCardCompetitionSubNode.competition_image;
            this.team1_name = featureCardCompetitionSubNode.team1_name;
            this.team1_image = featureCardCompetitionSubNode.team1_image;
            this.team2_name = featureCardCompetitionSubNode.team2_name;
            this.team2_image = featureCardCompetitionSubNode.team2_image;
            this.competition_logo = featureCardCompetitionSubNode.competition_logo;
        }

        @Override // com.squareup.wire.Message.Builder
        public FeatureCardCompetitionSubNode build(boolean z) {
            return new FeatureCardCompetitionSubNode(this, z);
        }
    }

    public FeatureCardCompetitionSubNode(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
            } else {
                this.url = str2;
            }
            String str3 = builder.competition_image;
            if (str3 == null) {
                this.competition_image = "";
            } else {
                this.competition_image = str3;
            }
            String str4 = builder.team1_name;
            if (str4 == null) {
                this.team1_name = "";
            } else {
                this.team1_name = str4;
            }
            String str5 = builder.team1_image;
            if (str5 == null) {
                this.team1_image = "";
            } else {
                this.team1_image = str5;
            }
            String str6 = builder.team2_name;
            if (str6 == null) {
                this.team2_name = "";
            } else {
                this.team2_name = str6;
            }
            String str7 = builder.team2_image;
            if (str7 == null) {
                this.team2_image = "";
            } else {
                this.team2_image = str7;
            }
            String str8 = builder.competition_logo;
            if (str8 == null) {
                this.competition_logo = "";
                return;
            } else {
                this.competition_logo = str8;
                return;
            }
        }
        this.title = builder.title;
        this.url = builder.url;
        this.competition_image = builder.competition_image;
        this.team1_name = builder.team1_name;
        this.team1_image = builder.team1_image;
        this.team2_name = builder.team2_name;
        this.team2_image = builder.team2_image;
        this.competition_logo = builder.competition_logo;
    }
}