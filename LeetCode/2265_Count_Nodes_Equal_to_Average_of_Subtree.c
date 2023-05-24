/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     struct TreeNode *left;
 *     struct TreeNode *right;
 * };
 */

int count(struct TreeNode* n);
int sum(struct TreeNode* n);

int averageOfSubtree(struct TreeNode* root){
    if (!root) return 0;
    int avg = sum(root) / count(root);

    if(root->left == NULL && root->right  == NULL) return 1;

    return (avg == root->val) + averageOfSubtree(root->left) + averageOfSubtree(root->right);
}

int count(struct TreeNode* n){
    if(n == NULL) return 0;

    if(n->left == NULL && n->right == NULL) return 1;

    return 1 + count(n->left) + count(n->right); // Preorder traversal
}

int sum (struct TreeNode* n){
    if(n == NULL) return 0;

    return n->val + sum(n->left) + sum(n->right); // Preorder traversal
}
