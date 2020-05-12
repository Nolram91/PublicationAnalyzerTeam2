package Backend.db.entity;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
class PublicationRatingKey implements Serializable {

    @Column(name = "community_id")
    Integer communityId;

    @Column(name = "publication_id")
    Integer publicationId;

    public PublicationRatingKey (){

    }

    public Integer getCommunityId() {
        return communityId;
    }

    public void setCommunityId(Integer communityId) {
        this.communityId = communityId;
    }

    public Integer getPublicationId() {
        return publicationId;
    }

    public void setPublicationId(Integer publicationId) {
        this.publicationId = publicationId;
    }

    // hashcode and equals implementation TODO
}