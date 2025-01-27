package shopping.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import shopping.model.Cart;
import shopping.model.Items;
import shopping.model.Users;

import java.util.List;
import java.util.Optional;

@Repository
public interface CartRepository extends MongoRepository<Cart,String>
{
    Optional<Cart> findByUserAndItem(Optional<Users> users, Optional<Items> item);

    List<Cart> findAllByUser(Users user );

    Cart findByUser(Users users);
}
