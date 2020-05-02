package org.hmily.backend.springbootbackend.controller;

import java.util.List;

import org.hmily.backend.springbootbackend.domain.Book;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api")
@Api("图书api")
public class BookController {

    // @Autowired
    // private BookService bookService;

    @ApiOperation("查询书本的信息")
    @RequestMapping(value ="/book", method = RequestMethod.GET)
    public List<Book> BookQry() {
        //return bookService.getBook();
        return null;
    }

    @ApiOperation("增加书本信息")
    @RequestMapping(value ="/book", method = RequestMethod.POST)
    public void BookAdd(Book book){
        //bookService.addBook(book);
    }

    @ApiOperation("修改书本信息")
    @RequestMapping(value ="/book", method = RequestMethod.PUT)
    public void BookUpdate(Book book){
        //bookService.updateBookById(book);
    }

    @ApiOperation("删除书本信息")
    @ApiImplicitParam(name = "id", value = "书本编号", required = true, dataType = "Integer")
    @RequestMapping(value ="/book", method = RequestMethod.DELETE)
    public void BookDel(@RequestParam(value="id") int id){
        //bookService.delBookById(id);
    }
}