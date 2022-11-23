package com.bezkup.balance.controller

import com.bezkup.balance.dto.CategoryDTO
import com.bezkup.balance.entity.Category
import com.bezkup.balance.services.CategoryService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/v1/categories")
class CategoryController @Autowired constructor(service: CategoryService) {

    val categoryService: CategoryService = service


    @RequestMapping(value = ["/{id}"], method = [RequestMethod.GET])
    fun getCategoryById(@PathVariable("id") id: Long) : Category? {
        return categoryService.searchById(id)
    }

    @RequestMapping(method = [RequestMethod.GET])
    fun getAllCategory() : List<Category>? {
        return categoryService.getAllCategories()
    }


    @RequestMapping(method = [RequestMethod.PUT])
    fun addCategory(@RequestBody request: CategoryDTO) : Map<String, String> {
        val categoryToSave = Category(request.name)
        categoryService.save(categoryToSave)
        return mapOf("result" to "ok")
    }

}