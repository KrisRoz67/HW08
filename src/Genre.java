import java.util.List;

public enum Genre {

    HORROR,
    COMEDY,
    THRILLER,
    ROMANCE,
    WESTERN,
    HISTORICAL,
    NOVELS,
    DETECTIVE;

    public static List<Genre> getListOfGenre (){
        return List.of(WESTERN,HORROR,THRILLER,ROMANCE,HISTORICAL,NOVELS,DETECTIVE);
    }
}
