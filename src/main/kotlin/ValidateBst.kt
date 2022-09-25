class ValidateBst {
    open class BST(value: Int) {
        var value = value
        var left: BST? = null
        var right: BST? = null
    }

    fun validate(tree: BST?, min: Int, max: Int): Boolean{
        if(tree == null) return true
        return (tree.value<max)&&
                (tree.value>=min)&&
                validate(tree.left, min, tree.value) &&
                validate(tree.right, tree.value, max)
    }

    fun validateBst(tree: BST): Boolean {

        return validate(tree, Int.MIN_VALUE, Int.MAX_VALUE)
    }

}