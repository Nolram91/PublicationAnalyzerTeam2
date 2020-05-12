package Backend.db.entity;


import javax.persistence.*;

@Entity
class PublicationRating{

    @EmbeddedId
    PublicationRatingKey id;

    @ManyToOne
    @MapsId("community_id")
    @JoinColumn(name = "community_id")
    Community community;

    @ManyToOne
    @MapsId("publication_id")
    @JoinColumn(name = "publication_id")
    Publication publication;

    int rating;

    public PublicationRating() {

    }

    public PublicationRatingKey getId() {
        return id;
    }

    public void setId(PublicationRatingKey id) {
        this.id = id;
    }

    public Community getCommunity() {
        return community;
    }

    public void setCommunity(Community community) {
        this.community = community;
    }

    public Publication getPublication() {
        return publication;
    }

    public void setPublication(Publication publication) {
        this.publication = publication;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}