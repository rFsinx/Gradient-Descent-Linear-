# Sum of squared residuals (SSR)

A quadratic function with a positive leading coefficient $\implies$ its derivative $= 0 \iff$ its global minimum.
The loss surface has a convex paraboloid shape.

$$
F(a, s) = \sum_{i=1}^{n} ((ax_i + s)-y_i)^2
$$

**Partial Derivatives:**
$$
\frac{\partial F}{\partial s} = \sum_{i=1}^{n} 2((ax_i + s) - y_i) \qquad \frac{\partial F}{\partial a} = \sum_{i=1}^{n} 2x_i((ax_i + s) - y_i)
$$

**Step Size (using learning rate $\alpha$):**
$$
s_{n+1} = s_n - \alpha \cdot \left. \frac{\partial F}{\partial s} \right|_{(a_n, s_n)} \qquad a_{n+1} = a_n - \alpha \cdot \left. \frac{\partial F}{\partial a} \right|_{(a_n, s_n)}
$$

---

# 2D Gradient Application

$\nabla F$ is a vector field (having vector outputs) $\implies \nabla F(a, s) = \frac{\partial F}{\partial a}\mathbf{i} + \frac{\partial F}{\partial s}\mathbf{j}$

**Vectorized Step Size (using learning rate $\alpha$):**
$$
\vec{x}_k = a_k\mathbf{i} + s_k\mathbf{j} \quad (\text{on } as\text{-plane} \implies \text{goal: toward vertex's } a \text{ and } s \text{ coordinates})
$$

$$
\therefore \vec{x}_{k+1} = \vec{x}_k - \alpha \nabla F(a_k, s_k)
$$
