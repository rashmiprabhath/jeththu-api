package srdp.projects.jeththu.api.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import srdp.projects.jeththu.api.entity.Item;
import srdp.projects.jeththu.api.models.ItemModel;
import srdp.projects.jeththu.api.repository.ItemRepository;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ItemService
{
    @Autowired
    private ItemRepository itemRepository;

    public void saveItem( ItemModel itemModel ){
        Item item = new Item();
        item.setName( itemModel.getName() );
        item.setDetails( itemModel.getDescription() );
        this.itemRepository.save(item);
    }

    public List<ItemModel> getAllItems(){
        List<Item> items = this.itemRepository.findAll();
        return items.stream().map( this::convertToItemModel ).collect( Collectors.toList());
    }

    public ItemModel getItem(int id){
        return this.itemRepository.findById( id ).map( this::convertToItemModel ).orElse( null );
    }

    private ItemModel convertToItemModel(Item item){
        ItemModel itemModel = new ItemModel();
        itemModel.setId( item.getItemId() );
        itemModel.setName( item.getName() );
        itemModel.setDescription( item.getDetails() );
        return itemModel;
    }

}
