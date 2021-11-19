package eu.zulewski.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.time.Instant;

@Data
@Entity
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private String postName;
    @Nullable
    @Lob
    private String description;
    private Integer voteCount;
    @ManyToOne(fetch = FetchType.LAZY)
    private User user;
    private Instant created;
    @ManyToOne(fetch = FetchType.LAZY)
    private Subreddit subreddit;

}
